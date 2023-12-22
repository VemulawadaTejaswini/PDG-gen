import java.util.*;
class Main{
    Main(){
	Scanner sc =new Scanner(System.in);
	int a ,c;
	for(int i=0;i<4;i++){
	    a=sc.nextInt();
	    c=sc.nextInt();
	    int b=0;
	    switch(a){
	    case 1:
		b+=6000*c;
		break;
	    case 2:
		b+=4000*c;
		break;
	    case 3:
		b+=3000*c;
		break;
	    case 4:
		b+=2000*c;
		break;
	    }
	    System.out.println(b);	
	}
    }
    public static void main (String[]arg){
	new Main();
    }
}