import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Light[] lights = new Light[m];
        for(int i=0; i<m; i++) {
            Light l = new Light();
            int k = in.nextInt();
            int[] s = new int[k];
            for(int j=0; j<k; j++) {
                s[j] = in.nextInt();
            }
            l.s = s;
            lights[i] = l;
        }
        for(int i=0; i<m; i++) {
            lights[i].p = in.nextInt();
        }

        int attempts = 1 << n;
        int result = 0;
        for(int i=0; i<attempts; i++) {
            boolean isAllOn = true;
            for(int j=0; j<m; j++) {
                if(!lights[j].isOn(i)) {
                    isAllOn = false;
                    break;
                }
            }
            if(isAllOn) {
                result++;
            }
        }
        System.out.println(result);
    }
}
class Light {
    int[] s;
    int p;
    public boolean isOn(int switches) {
        int c = 0;
        for(int i=0; i<this.s.length; i++) {
            if((switches & (1<<i)) > 0) {
                c++;
            }
        }
        return (c%2 == this.p);
    }
}
