import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] input = new String[N];
        int i = 0;
        int intial_score = 0;
        for(String s: sc.next().split("")){
            if(s.equals("E") && i != 0){
                intial_score++;
            }
            input[i] = s;
            i++;
        }
        int min = intial_score;
        int tmp = intial_score;
        for(int j = 1; j < N; j++){
            if(input[j - 1].equals("W") && input[j].equals("E")){

            }else if(input[j - 1].equals("E") && input[j].equals("E")){
                tmp--;
            }else if(input[j - 1].equals("E") && input[j].equals("W")){

            }else if(input[j - 1].equals("W") && input[j].equals("W")){
                tmp++;
            }
//            System.out.println(tmp);
            min = Math.min(min, tmp);
        }
        System.out.println(min);
    }
}
