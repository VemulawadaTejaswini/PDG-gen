import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int b, r, c, i, j, k, sum;
        sum = 0;
        r = scan.nextInt();
        c = scan.nextInt();
        int a[][] = new int[r + 1][c + 1];
        
        for(i = 0; i < r; i++){
            for(j = 0; j < c; j++){
                b = scan.nextInt();
                a[i][j] = b;
                sum += b;
        	}
            a[i][j] = sum;
            sum = 0;
        }
        for(j = 0; j < c + 1; j++){
            for(i = 0; i < r; i++){
                sum += a[i][j];
        	}
            a[i][j] = sum;
            sum = 0;
        }
        
        for(i = 0; i < r + 1; i++){
            for(j = 0; j < c + 1; j++){
                System.out.printf("%d", a[i][j]);
                if(j == c) break;
                System.out.printf(" ", a[i][j]);
        	}
            System.out.printf("\n");
        }
        scan.close();
    }
}

