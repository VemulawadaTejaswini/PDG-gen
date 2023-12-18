import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        double result=0;
        for(int i=1;i<=N;i++){
            if(i<K){
                int count=(int)(Math.ceil((Math.log10((double)K/(double)i)/Math.log10(2.0)))+0.01);
                result+=Math.pow(0.5,count);
            }else{

                result+=1;
            }
        }

        System.out.println(result/N);

    }
    static boolean isMonth(int a){
        return a>0&&a<13;
    }

}
