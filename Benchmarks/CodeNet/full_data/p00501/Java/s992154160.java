import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        char name[] =in.next().toCharArray();;
        int count = 0;
        for(int i=0;i<N;i++) {
        	int m = 0,n = 0;
        	char Signboard[]=in.next().toCharArray();
            for(int j=0;j<=Signboard.length-name.length;j++) {
                for(int k=1;k*(name.length-1)+1+j<=Signboard.length;k++) {
                    for(int l=0;l<name.length;l++) {
                        if(name[l] != Signboard[j+k*l]) n = 1;
                    }
                    if (n == 0) {
                        m = 1;
                        break;
                    }
                }
                if(m == 1) break;
            }
            if(m == 1) count++;
        }
        System.out.println(count);
    }
}