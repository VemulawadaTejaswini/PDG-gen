import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	Dice dice = new Dice(); 
	for(int i=1;i<=6;i++){
	    dice.putNum(in.nextInt(),i);
	}
	dice.top=dice.num1;
	

        String str = in.next();
	for(int i=0;i<str.length();i++){
	    char order = str.charAt(i);
	    if(order == 'E')dice.moveDice('E');
	    else if(order == 'W')dice.moveDice('W');
	    else if(order == 'N')dice.moveDice('N');
	    else if(order == 'S')dice.moveDice('S');
	}
    
       
	System.out.println(dice.returnTop());
    }
}

class Dice{
    int  num1,num2,num3,num4,num5,num6;
    int tmp,top;
    Dice(){}
	
    public void putNum(int num,int i){
	if(i == 1)this.num1=num;
	else if(i == 2)this.num2=num;
	else if(i == 3)this.num3=num;
	else if(i == 4)this.num4=num;
	else if(i == 5)this.num5=num;
	else if(i == 6)this.num6=num;
    }
    
    public void moveDice(char order){
	if(order == 'W'){
	    this.tmp = this.num1;
	    this.num1 = this.num3;
	    this.num3 = this.num6;
	    this.num6 = this.num4;
	    this.num4 = this.tmp;
	    this.top = this.num1;
	}else if(order == 'E'){
	    this.tmp = this.num1;
	    this.num1 = this.num4;
	    this.num4 = this.num6;
	    this.num6 = this.num3;
	    this.num3 = this.tmp;
	    this.top = this.num1;
	}else if(order == 'N'){
	    this.tmp = this.num1;
	    this.num1 = this.num2;
	    this.num2 = this.num6;
	    this.num6 = this.num5;
	    this.num5 = this.tmp;
	    this.top = this.num1;
	}else if(order == 'S'){
	    this.tmp = this.num1;
	    this.num1 = this.num5;
	    this.num5 = this.num6;
	    this.num6 = this.num2;
	    this.num2 = this.tmp;
	    this.top = this.num1;
	}
    }
    public int returnTop(){
	return this.top;
    }

}
	
    	


