import java.util.Scanner;

public class Main {
    public static void main(String...args){
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int probNum=0;
        String judge= null;
        int penalties=0;
        int flag=0;
        int oldProb=1;
        int correct=0;
        for(int i=1; i<=M; i++){
            probNum = sc.nextInt();
            if(probNum==oldProb){
                continue;
            }
            else{
                flag=0;
            }
            judge= sc.next();
            if(judge.equals("WA")){
                if(flag!=1) {
                    penalties++;
                }
            }
            if(judge.equals("AC")){
                if(flag!=1){
                    flag=1;
                    correct++;
                }
            }
        }
        System.out.println(correct);
        System.out.println(penalties);
    }
}
