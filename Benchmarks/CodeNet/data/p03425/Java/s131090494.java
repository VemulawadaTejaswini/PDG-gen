import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
		
int n = sc.nextInt();sc.nextLine();
String p[] = new String[n];
for(int i=0; i<n; i++){
p[i]= sc.next();
}

String m = "M";
String a = "A";
String r = "R";
String c = "C";
String h = "H";
int q1=0;
int q2=0;
int q3=0;
int q4=0;
int q5=0;




for(int j=0; j<n; j++){
int result1 = p[j].indexOf(m);
if (result1 == 0) {
   q1++;
} else {
   q1 = q1;
}
}

for(int j=0; j<n; j++){
int result2 = p[j].indexOf(a);
if (result2 == 0) {
   q2++;
} else {
   q2 = q2;
}
}

for(int j=0; j<n; j++){
int result3 = p[j].indexOf(r);
if (result3 == 0) {
   q3++;
} else {
   q3 = q3;
}
}

for(int j=0; j<n; j++){
int result4 = p[j].indexOf(c);
if (result4 == 0) {
   q4 ++;
} else {
   q4 = q4;
}
}

for(int j=0; j<n; j++){
int result5 = p[j].indexOf(h);
if (result5 == 0) {
   q5++;
} else {
   q5 = q5;
}
}

int[] array = new int[5];
array[0]=q1;
array[1]=q2;
array[2]=q3;
array[3]=q4;
array[4]=q5;

int l=0;

for(int i=0;i<5;i++){
for(int j=i+1;j<5;j++){
for(int k=j+1;k<5;k++){
l=l+array[i]*array[j]*array[k];
}
}
}
System.out.println(l);
}
}
