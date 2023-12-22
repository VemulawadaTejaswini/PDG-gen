


import java.io.BufferedReader;import java.io.IOException;import java.io.InputStream;import java.io.InputStreamReader;import java.io.PrintStream; class Main {     public static void main(String[] args) throws IOException {        doit(args, System.in, System.out);    }     static void doit(String[] args, InputStream in, PrintStream out)            throws IOException {        BufferedReader reader = new BufferedReader(new InputStreamReader(in));        int[] counts = new int[4];        while (true) {            String line = reader.readLine();            if (line == null || line.isEmpty()) {                break;            }            String[] values = line.split(",");            String type = values[1];            if (type.equals("A")) {                counts[0]++;            } else if (type.equals("B")) {                counts[1]++;            } else if (type.equals("AB")) {                counts[2]++;            } else {                counts[3]++;            }        }        for (int count : counts) {            out.println(count);        }    }} 




Compile Error Logs:





 

Status 


Judge: 1/1 

JAVA 

CPU: 00.04 sec 

Memory: 8976 [KB] 

Length: 1102 [B] 

2012-10-08 15:16 

2012-10-08 15:16 

Results for testcases

 


















Case #1: 

: Accepted 

-
 
-

 - 

NA 

- 

NA 






< |
 
1
 
/ 

1
 
| > 

 
 
 : Accepted        -        -
 

 
 


Input #1 ( )
 

Output #1 ( )
 



Not available. 


Not available. 

Comments
 

 Under Construction. 

 
Categories
 



 
Free Tags 
 
 


 