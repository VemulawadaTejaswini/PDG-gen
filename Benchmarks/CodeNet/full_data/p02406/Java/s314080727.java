  26212 KB    23 lines     450 bytes    2016-07-12 11:16 




?

1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
 
import java.io.IOException;
import java.util.Scanner;
 
class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
 
        for (int i = 1; i <= n; i++) {
            int x = i;
            if (x % 3 == 0 || x % 10 == 3) {
                System.out.print(" " + i);
            }else if(i >= 30){
                x /= 10;
                if(x % 10 == 3){
                    System.out.print(" " + i);
                }
            }
        }
        System.out.println("");
    }
}
 