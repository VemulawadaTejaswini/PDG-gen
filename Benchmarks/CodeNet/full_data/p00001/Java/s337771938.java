import java.io.*;

class Main{
public static void main(String a[])
class MyList{
		public MyList(){};
		int X[];
		
		void add(int a,int i){
			this.X[i]=a;
		}
	}
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
MyList my=new MyList();
for(int i=0;i<10;i++){
int x;
String a=new int(in.readLine());
try{
x=Integer.parseInt(a);
}catch(NumberFormatException e){
}

if(0>x||x>10000){
while(0>x||x>10000){
x=new int(in.readLine());
}
my.add(x,i);
}
Bubble_Sort(my.X,10)
for(int i=0;i<3;i++){
System.out.println(my.X[i]);
}

}


public static void Bubble_Sort(int num[],int x){
		int i,j;	//??????????¨???¶??¨?????°
		int changenum;
		for(i=0;i<x-1;i++){
			for(j=x-1;j>i;j--){
				if(num[j-1]>num[j]){
					changenum=num[j];
					num[j]=num[j-1];
					num[j-1]=changenum;
				}
			}
		}
	}