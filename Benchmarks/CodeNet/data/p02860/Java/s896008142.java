import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
Scanner sc1=new Scanner(System.in);
Scanner sc2=new Scanner(System.in);
int N=sc1.nextInt(),bandera=0;
String texto=sc2.nextLine();
char superstring[]=new char[N];
if(N!=texto.length()){bandera=1;}
for(int i=0;i<texto.length();i++){superstring[i]=texto.charAt(i);}
if(N%2==1){bandera=1;}
else{for(int i=0;i<N/2;i++){if(superstring[i]!=superstring[i+N/2]){bandera=1;break;}}}
if(bandera==0){System.out.println("Yes");}else{System.out.println("No");}

    }
}
