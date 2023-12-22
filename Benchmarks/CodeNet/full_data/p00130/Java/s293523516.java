/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//String str = "a->e<-a<-d->a->e<-a<-d<-c->d->a<-d<-c<-b->c->d<-c";
		String str;
		
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
        	str = "";
	        str = sc.next();
			
			str = str.replaceAll("-","");
			//System.out.println(str);
			
			char chr;
			String result = "";
			boolean before = false;
			boolean next = false;
			
			int i = 0;
			for(i=0; i<str.length();i++){
				chr = str.charAt(i);
				if (i==0){
					result = String.valueOf(chr);
				}else{
					if (chr == '<'){
						before = true;
					}else if(chr == '>'){
						next = true;
					}else {
						//System.out.println("result:" + result);
						//System.out.println("chr:" + chr);
						if(result.indexOf(chr) == -1){
							if (before){
								result = String.valueOf(chr) + result;
							}else{
								result = result + String.valueOf(chr);
							}
						}
						before = false;
						next = false;
					}
				}
			}
			System.out.println(result);
        }
	}
}