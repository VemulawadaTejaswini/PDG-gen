import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //x^2+y^2+z^2+xy+yz+zx=n;
        int x = 1;
        int y = 1;
        int z = 1;
        for(int i=1; i<=n; i++) {
            int cnt =0;
            for(int j=1; j<=x+1; j++) {
                for(int k=1; k<=y+1; k++){
                    for(int l=1; l<=z+1; l++) {
                        if(j*j+k*k+l*l+j*k+k*l+l*j == i) {
                            cnt++;
                        }
                    }
                }
            }
            System.out.println(cnt);
            x++;
            y++;
            z++;
        }
    }
}
