import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] S = new String [N+1];
        int [] C = {0,0,0,0};
        for(int i=0;i<N+1;i++){
            S[i] = scan.nextLine();
        }
        for(int i=0;i<N+1;i++){
            switch(S[i]){
                case "AC":
                    C[0] += 1;
                    break;
                case "WA":
                    C[1] += 1;
                    break;
                case "TLE":
                    C[2] += 1;
                    break;
                case "RE":
                    C[3] += 1;
                    break;
                default:
            }
        }
        System.out.println("AC x " + C[0] + "\n" + "WA x " + C[1] + "\n" + "TLE x " + C[2] + "\n" + "RE x " + C[3]);

        scan.close();
    }
}
