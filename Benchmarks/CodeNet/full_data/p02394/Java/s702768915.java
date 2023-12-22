import java.util.Scanner;

class Main{
public static void main(String[] args){

 Scanner s = new Scanner(System.in); 
	int W=s.nextInt();
	int H=s.nextInt();
	int x=s.nextInt();
	int y=s.nextInt();
	int r=s.nextInt();
	int F=0;
	
	if(x+r>W){F=1;}
	if(y+r>H){F=1;}
    if(r>x){F=1;}
	if(r>y){F=1;}
	if(F==0){System.out.println("Yes");}
	else{System.out.println("No");}
}
}
	
