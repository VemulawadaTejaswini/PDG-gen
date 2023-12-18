import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
      String[] tA=sc.nextLine().split("");
      String[] tB=sc.nextLine().split("");
      String[] tC=sc.nextLine().split("");

//    String nyuA=sc.nextLine();
 //  String nyuB=sc.nextLine();

//int n=Integer.parseInt(nyu);

//int A=Integer.parseInt(t[0]);
//int B=Integer.parseInt(t[1]);

Queue<String> qA = new ArrayDeque<>();
Queue<String> qB = new ArrayDeque<>();
Queue<String> qC = new ArrayDeque<>();

for(String tem:tA)qA.add(tem);
for(String tem:tB)qB.add(tem);
for(String tem:tC)qC.add(tem);

String beg=qA.poll();

while(true){
String pre=beg;

//System.out.println(beg+"--");
switch(beg){
case "a":
beg=qA.poll();
break;
case "b":
beg=qB.poll();
break;
case "c":
beg=qC.poll();
break;
}

if(beg==null){
System.out.println(pre.toUpperCase());
break;
}

}




	}
}