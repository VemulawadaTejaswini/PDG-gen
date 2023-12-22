package codeiq;

import java.util.Scanner;

class Dice {
   public static void main(String[] args){
	  Scanner s=new Scanner(System.in);
	  int a[]={s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt()};
	  String c=s.next();
	  //System.out.println(c);
	  Dicelabel q=new Dicelabel(a[0],a[3],a[2],a[4],a[1],a[5]);
	  for(int i=0;i<c.length();i++){
	    q=q.diceRoll(c.charAt(i));
	  }
	  System.out.println(q.number);
   }
}


class Dicelabel{
	int number;
    int eroll;
    int wroll;
    int nroll;
    int sroll;
    int under;
    Dicelabel(int number,int e,int w,int s,int n,int under){
    	this.number=number;
    	this.eroll=e;
    	this.wroll=w;
    	this.sroll=s;
    	this.nroll=n;
    	this.under=under;
    }
	
	Dicelabel diceRoll(char direction){
		if(direction=='E'){
			return new Dicelabel(eroll,under,number,sroll,nroll,wroll);
		}
		if(direction=='W'){
			return new Dicelabel(wroll,number,under,sroll,nroll,eroll);
		}
		if(direction=='S'){
			return new Dicelabel(sroll,eroll,wroll,under,number,nroll);
		}
		if(direction=='N'){
			return new Dicelabel(nroll,eroll,wroll,number,under,sroll);
		}
		return null;
	}
}