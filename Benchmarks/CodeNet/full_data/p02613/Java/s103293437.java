import java.util.Scanner;

class Main{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String [] S = new String[N];
        int [] C = new int[4];
        C[0] = 0;
        C[1] = 0;
        C[2] = 0;
        C[3] = 0;
        for(int i = 0; i < N; i++){
            S[i] = scan.nextLine();
            if(S[i] == "AC"){
                C[0]++;
            }
            else if(S[i] == "WA"){
                C[1]++;
            }
            else if(S[i] == "TLE"){
                C[2]++;
            }
            else if(S[i] == "RE"){
                C[3]++;
            }
        }
        System.out.println("AC x " + C[0]);
        System.out.println("WA x " + C[1]);
        System.out.println("TLE x " + C[2]);
        System.out.println("RE x " + C[3]);
        
        scan.close();
    }
}