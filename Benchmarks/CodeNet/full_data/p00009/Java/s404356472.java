import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int[] numlist = new int[30];
        int maxnum = 0;

        int index = 0;
        while(sc.hasNext()){  
            numlist[index] = sc.nextInt();
            if(maxnum < numlist[index]){
                maxnum = numlist[index];
            }
            index++;
        }

        int[] series = new int[maxnum+1];
        boolean[] checklist = new boolean[maxnum+1];
        series[0] = 0;
        series[1] = 1;
        checklist[0] = false;
        checklist[1] = false;
        for(int i = 2; i < maxnum+1; i++){
            series[i] = i;
            checklist[i] = true;
        }

        for(int i = 2; i < maxnum+1; i++){
            if(!checklist[i]){continue;}
            for(int j = 2; i*j < maxnum+1; j++){
                checklist[i*j] = false;
            }
        }

        int count;
        for(int i = 0; i < index; i++){
            count = 0;
            for(int j = 2; j < numlist[i] + 1; j++){
                if(checklist[j]){count++;}
            }
            System.out.println(count);
        }
 
    }
}