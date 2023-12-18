import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
 
   public void main(String args[]) {
     Scanner scan = new Scanner(System.in);
     String str = scan.next();
     int x = Integer.valueOf(str);
     str = scan.next();
     int y = Integer.valueOf(str);

    System.out.println(calc(x, y));
    }

    public int calc ( int num1, int num2){
        int z = 0;
        if (1 <= num1 && num1 <= 100 && 1 <= num2 && num2 <= 100 && num2 % 2 == 0) {
            z = num1 + num2 / 2;
        }
        return z;
    }
}