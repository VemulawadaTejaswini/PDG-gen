import java.util.*;

public class Main {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] x = new int[5];
    int ans = 0;
    for(int i=0;i<5;i++) {
        x[i] = scan.nextInt();
        if(x[i] == 0) {
            ans = i + 1;
        }
    } 

    System.out.println(ans);
    scan.close();

}

};
