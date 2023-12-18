
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		long lng = Long.parseLong(s);
		String[] str=s.split("");
		int answer=Integer.parseInt(str[0]);

		boolean f=false;
		for(int i=1;i<str.length;i++){
			int n=Integer.parseInt(str[i]);
			if(n==9){
				answer=answer+9;
				if(i==str.length-1){
					f=true;
				}
			}else{
				break;
			}
		}

		if(f){

		}else{
		if(lng<10){
			answer=Integer.parseInt(s);
		}else if(lng<100){
			if(lng==99){
				answer=18;
			}else{
				answer=Integer.parseInt(str[0])-1+9;
			}
		}else if(lng<1000){//3
			if(lng==999){
				answer=9*3;
			}else{
				answer=Integer.parseInt(str[0])-1+9*2;
			}
		}else if(lng<10000){//4
			if(lng==9999){
				answer=9*4;
			}else{
				answer=Integer.parseInt(str[0])-1+9*3;
			}
		}else if(lng<100000){//5
			if(lng==99999){
				answer=9*5;
			}else{
				answer=Integer.parseInt(str[0])-1+9*4;
			}
		}else if(lng<1000000){//6
			if(lng==999999){
				answer=9*6;
			}else{
				answer=Integer.parseInt(str[0])-1+9*5;
			}
		}else if(lng<10000000){//7
			if(lng==9999999){
				answer=9*7;
			}else{
				answer=Integer.parseInt(str[0])-1+9*6;
			}
		}else if(lng<100000000){//8
			if(lng==99999999){
				answer=9*8;
			}else{
				answer=Integer.parseInt(str[0])-1+9*7;
			}
		}else if(lng<1000000000){//9
			if(lng==999999999){
				answer=9*9;
			}else{
				answer=Integer.parseInt(str[0])-1+9*8;
			}
		}else if(lng<10000000000L){//10
			if(lng==9999999999L){
				answer=9*10;
			}else{
				answer=Integer.parseInt(str[0])-1+9*9;
			}
		}else if(lng<100000000000L){//11
			if(lng==99999999999L){
				answer=9*11;
			}else{
				answer=Integer.parseInt(str[0])-1+9*10;
			}
		}else if(lng<1000000000000L){//12
			if(lng==999999999999L){
				answer=9*12;
			}else{
				answer=Integer.parseInt(str[0])-1+9*11;
			}
		}else if(lng<10000000000000L){//13
			if(lng==9999999999999L){
				answer=9*13;
			}else{
				answer=Integer.parseInt(str[0])-1+9*12;
			}
		}else if(lng<100000000000000L){//14
			if(lng==99999999999999L){
				answer=9*14;
			}else{
				answer=Integer.parseInt(str[0])-1+9*13;
			}
		}else if(lng<1000000000000000L){//15
			if(lng==999999999999999L){
				answer=9*15;
			}else{
				answer=Integer.parseInt(str[0])-1+9*14;
			}
		}else if(lng<10000000000000000L){//16
			if(lng==9999999999999999L){
				answer=9*16;
			}else{
				answer=Integer.parseInt(str[0])-1+9*15;
			}
		}else{
			answer=9*15;
		}
		}
		System.out.println(answer);
	}
}
