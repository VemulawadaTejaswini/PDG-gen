import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Q = scan.nextInt();        
        String str = scan.next();
        String []t = new String[Q];
        String []d = new String[Q];
        int g[] = new int[N];
        String L = "L";
        String R = "R";
        int sum = 0;


        String[] strArray = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            String str2 = String.valueOf(str.charAt(i));
            strArray[i] = str2;
            g[i] = i;
        }

        for (int i = 0; i < Q; i++) {
            t[i] = scan.next();
            d[i] = scan.next();

            for(int a = 0; a < N ; a++){
                if(t[i].equals(strArray[a])){
                    if(d[i].equals(L)){
                        for(int a2 = 0; a2 < N ; a2++){
                            if(g[a2] == a){
                                g[a2] = (g[a2] - 1);
                            }
                        }
                    }

                    if(d[i].equals(R)){
                        for(int a2 = 0; a2 < N ; a2++){
                            if(g[a2] == a){
                                g[a2] = (g[a2] + 1);
                            }
                        }
                    }
                }

            }
            
        }

        for( int a = 0 ; a < N ; a++){
            if(g[a] > 0 && g[a] < N){
                sum = sum + 1;
            }     
        }
        System.out.println(sum);
    }
}
