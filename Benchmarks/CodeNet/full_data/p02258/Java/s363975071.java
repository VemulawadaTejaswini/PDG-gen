
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
33
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
  
public class Main {
  
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
          
        int n=Integer.parseInt(br.readLine());
        int [] in=new int[n];
        int max=Integer.MIN_VALUE;
          
        for(int i=0;i<n;i++)
            in[i]=Integer.parseInt(br.readLine());
              
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int tmp=in[j]-in[i];
                if(tmp>max) max=tmp;
            }
        }
System.out.println(max);
  
  
  
  
    }
  
}