import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p=0;
        while(true){
            int a=sc.nextInt(),b=sc.nextInt();
            if(a==0&&b==0)break;
            if(p>0){
                System.out.println();
            }
            boolean check=true;
            for(int i=a;i<=b;i++){
                boolean uru=false;
                if(i%4==0){
                    if(i%100==0){
                        if(i%400==0){
                            uru=true;
                        }
                    }else{
                        uru=true;
                    }
                }
                if(uru){
                    System.out.println(i);
                    check=false;
                }
            }
            if(check){
                System.out.println("NA");
            }
            p++;
        }
    }
}