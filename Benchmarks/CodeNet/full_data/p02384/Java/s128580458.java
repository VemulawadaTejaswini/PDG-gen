import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	Dice dice = new Dice(); 
	for(int i=1;i<=6;i++){
	    dice.putNum(in.nextInt(),i);
	}
        
	

        int order_number = in.nextInt();
	for(int i=0;i<order_number;i++){
	    int top = in.nextInt();
	    int front = in.nextInt();
	    int right = dice.get_Right(top,front);
	    System.out.println(right);
	}
    }
}
       
class Dice{
    int  num1,num2,num3,num4,num5,num6;
    int tmp,top;
    Dice(){}
	
    public int get_Right(int top,int front){
	if((top==num1 && front==num2)|| (top==num2 && front==num1)){
	    if(front==num2)return num3;
	    else return 7-num3;
	}else if((top==num1 && front==num3)|| (top==num3 && front==num1)){
	    if(front==num3)return num5;
	    else return 7-num5;
	}else if((top==num1 && front==num4)|| (top==num4 && front==num1)){
	    if(front==num4)return num2;
	    else return 7-num2;
	}else if((top==num1 && front==num5)|| (top==num5 && front==num1)){
	    if(front==num5)return num4;
	    else return 7-num4;
	}

	if((top==num2 && front==num3)|| (top==num3 && front==num2)){
	    if(front==num3)return num1;
	    else return 7-num1;
	}else if((top==num2 && front==num4)|| (top==num4 && front==num2)){
	    if(front==num4)return num6;
	    else return 7-num6;
	}else if((top==num2 && front==num6)|| (top==num6 && front==num2)){
	    if(front==num6)return num3;
	    else return 7-num3;
	}

	
	if((top==num3 && front==num6)|| (top==num6 && front==num3)){
	    if(front==num6)return num5;
	    else return 7-num5;
	}else if((top==num3 && front==num5)|| (top==num5 && front==num3)){
	    if(front==num5)return num1;
	    else return 7-num1;
	}

	if((top==num4 && front==num5)|| (top==num5 && front==num4)){
	    if(front==num4)return num6;
	    else return 7-num6;
	}else if((top==num4 && front==num6)|| (top==num6 && front==num4)){
	    if(front==num6)return num2;
	    else return 7-num2;
	}

	if((top==num5 && front==num6)|| (top==num6 && front==num5)){
	    if(front==num6)return num3;
	    else return 7-num3;
	}
	

	return 0;
    }


    
	   
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
	
    

