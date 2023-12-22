import java.util.Arrays;
import java.util.Scanner;
 
public class Main{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            while(true) {
                int n = Integer.parseInt(sc.nextLine());
                if(n==0) break;
                int [] kouho = new int[26];
                int [] sokuhou = new int[26];
                String[] vote = new String[n];
                for(int i=0;i<26;i++) {
                    kouho[i] = 0;
                }
                vote = sc.nextLine().split(" ");
                boolean flag = true;
                loop:for(int i=1;i<=n;i++) {
                    int d = vote[i-1].charAt(0) - 'A';
                    kouho[d] += 1;
                    for(int j=0;j<26;j++) {
                        sokuhou[j] = kouho[j];
                    }
                    Arrays.sort(sokuhou);
                    if(sokuhou[24]+(n-i)<sokuhou[25]) {
                        int k=0;
                        for(k=0;k<26;k++) {
                            if(kouho[k] == sokuhou[25]) break;
                        }
                        System.out.printf("%c %d", k +'A',i);
                        System.out.println();
                        flag = false;
                        break loop;
                    }
                }
                if(flag) System.out.println("TIE");
            }
 
        }   
    }
}
