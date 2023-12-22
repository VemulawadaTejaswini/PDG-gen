import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            while(true){
                int n=sc.nextInt();
                if(n ==0){
                    break;
                }
                int[] scores =new int [n];
                for(int i=0;i<scores.length;i++){
                    scores[i]=sc.nextInt();
                }
                double ave=0,var=0,sum=0;
                for(int i=0;i<scores.length;i++){
                    sum=sum+scores[i];
                }
                ave = sum/n;
                for(int i=0;i<scores.length;i++){
                    var=var+((scores[i]-ave)*(scores[i]-ave))/n;
                }
                System.out.println(Math.sqrt(var));
                
            }
        }
    }
}
