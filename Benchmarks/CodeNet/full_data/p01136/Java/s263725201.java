import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        int n;
        while((n=Integer.parseInt(reader.readLine())) != 0){
            boolean[][] schedule = new boolean[n][30];
            for(int i=0; i<n; i++){
                for(int j=0; j<30; j++){
                    schedule[i][j] = false;
                }
            }
            int firstDay = 30, f;
            for(int i=0; i<n; i++){
                String[] tmp = reader.readLine().split(" ");
                if(firstDay > (f = Integer.parseInt(tmp[0]))){
                    firstDay = f;
                }
                for(int j=0; j<tmp.length; j++){
                    schedule[i][Integer.parseInt(tmp[j])-1] = true;
                }
            }
            removeUnavailableDays(schedule);
            int minDay = -1;
            for(int i=0; i<30; i++){
                if(back(schedule, i, n).size()==n){
                    minDay = i;
                    break;
                }
            }
            System.out.println(minDay + 1);
        }
    }

    private static void removeUnavailableDays(boolean[][] schedule){
        for(int j=0; j<schedule[0].length; j++){
            int count = 0;
            int lastIndex = 0;
            for(int i=0; i<schedule.length; i++){
                if(schedule[i][j]){
                    count++;
                    lastIndex = i;
                }
            }
            if(count == 1){
                schedule[lastIndex][j] = false;
            }
        }
    }

    private static List<Integer> back(boolean[][] schedule, int day, int n){
        List<Integer> appear = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            if(schedule[i][day])
               appear.add(i);
        }
        for(int j=day-1; j>=0; j--){
            boolean appearDay = false;
            int[] appearedPerson = new int[n];
            int tmp = 0;
            for(int i=0; i<n; i++){
                if(schedule[i][j]){
                    if(appear.contains(i)){
                        appearDay = true;
                    } else {
                        appearedPerson[tmp++] = i;
                    }
                }
            }
            if(appearDay && tmp>0) {
                for(int i=0; i<tmp; i++){
                    appear.add(appearedPerson[i]);
                }
            }
            if(appear.size() == n){
                break;
            }

        }
        return appear;
    }
}