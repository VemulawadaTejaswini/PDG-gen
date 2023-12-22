import java.io.*;
class Main{
public static void main(String[] args){
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str1=br.readLine();
int n=Integer.parseInt(str1);
String str2=br.readLine();
String[] arr=str2.split(" ");
int[] arr2 =new int[n];
for(int k=0; k<n; k++){
arr2[k]=Integer.parseInt(arr[k]);
}
int sum=0;
for(int i=0; i<n; i++){
sum +=arr2[i];
}
int min=arr2[0], max=arr2[0];
for(int j=1; j<n; j++){
if(min > arr2[j]) min=arr2[j];
if(max < arr2[j]) max=arr2[j];
}
System.out.println(min+" "+max+" "+sum);
br.close();
}
}