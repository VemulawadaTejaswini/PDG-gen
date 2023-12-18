import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int N       = sc.nextInt();
        int nineSet = 9;
        int sixSet  = 6;
        int count   = 0;

        while(true){

            if(N < 6){
                break;
            }else if( (14 >= N) && (N >= 12) ){
                count += 2;
                N -= 12;
                break;
            }

            for(int i = 1 ; i < 10 ; i++){
                if(N < nineSet){
                    if(i != 1){
                        count++;
                        nineSet /= 9;
                        N -= nineSet;
                    }
                    break;
                }
                nineSet *= 9;
            }

            for(int i = 1; i < 10 ; i++){
                if(N < sixSet){
                    if(i != 1){
                        count++;
                        sixSet /= 6;
                        N -= sixSet;
                    }
                    break;
                }
                sixSet *= 6;
            }

            nineSet = 9;
            sixSet  = 6;
        } 

        System.out.println(count + N);
    }
}