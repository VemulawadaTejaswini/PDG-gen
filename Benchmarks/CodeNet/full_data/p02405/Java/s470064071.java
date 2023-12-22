import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j;
        while(true){
            int H =sc.nextInt();
            int W =sc.nextInt();
            if(H==0&&W==0){
                break;
            }
            for(i=0;i<H;i++){
                for(j=0;j<W;j++){
                    if(i%2==1){
                        if(j%2==1){
                            System.out.printf("#");
                        }else{
                            System.out.printf(".");
                        }
                    }else{
                        if(j%2==1){
                            System.out.printf(".");
                        }else{
                            System.out.printf("#");
                        }
                    }
                    }
                    System.out.printf("\n");
                }
            }

        }
    }
