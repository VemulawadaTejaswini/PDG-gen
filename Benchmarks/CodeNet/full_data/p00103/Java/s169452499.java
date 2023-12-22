/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Inning{
	int Point;
	int OutCount;
	boolean First;
	boolean Second;
	boolean Third;
	
	public void InitInning(){
		Point = 0;
		OutCount = 0;
		First = false;
		Second = false;
		Third = false;
	}
	
	public void DoHit(){
		if(Third == true){
			Point += 1;
			Third = false;
		}
		if(Second == true){
			Third = true;
			Second = false;
		}
		if(First == true){
			Second = true;
			First = false;
		}
		First = true;
	}
	
	public void DoOut(){
		OutCount += 1;
		if (OutCount==3){
			EndEninng();
		}
	}
	
	public void DoHomerun(){
		if(Third == true){
			Point += 1;
			Third = false;
		}
		if(Second == true){
			Point += 1;
			Second = false;
		}
		if(First == true){
			Point += 1;
			First = false;
		}
		Point += 1;
	}
	
	public void EndEninng(){
		System.out.println(Point);
		InitInning();
	}
}

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		
		int Inning = 1;
		String[] str = {"HIT","HIT","HOMERUN","OUT","HIT","HOMERUN","OUT","HIT","OUT",null};
		
		/*
		int Inning = 0;
		String[] str = new String[100];
		
        while(sc.hasNext()){
        	if (Inning ==0){
        		Inning = sc.nextInt();
        	}else{
        		str[i] = sc.nextLine();
        		i++;
        	}
        }
        */
        
        Inning obj = new Inning();
		obj.InitInning();
		
		for (i = 0; i < str.length; i++){
			if(str[i]==null){
				break;
			}else if(str[i]=="HIT"){
				obj.DoHit();
				//System.out.println("Hit");
			}else if(str[i]=="HOMERUN"){
				obj.DoHomerun();
				//System.out.println("Homerun");
			}else if(str[i]=="OUT"){
				obj.DoOut();
				//System.out.println("Out");
			}else{
				break;
			}
		}
	}
}