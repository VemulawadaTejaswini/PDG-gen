00.26 sec    25904 KB    33 lines     637 bytes    2015-07-07 22:15
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
23
24
25
26
27
28
29
30
31
32
//Structured Program I - Print a Rectangle
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Main {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 
        String input;
         
         while (!(input = in.readLine()).equals("0 0")) {
 
             String[] HW = input.split(" ");
 
             int H = Integer.parseInt(HW[0]);
             int W = Integer.parseInt(HW[1]);
 
             for(int i=0;i<H;i++){
                 for(int j=0;j<W;j++){
                     System.out.print("#");
                 }
                 System.out.println();
             }
             System.out.println();
              
         }
 
    }
}