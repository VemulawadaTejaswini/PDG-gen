import java.util.*;
import java.io.*;
public class Main{
	
  public static void main(String[] args){
  	HashMap<String,Integer> map = new HashMap<String,Integer>();
    Scanner scan = new Scanner(System.in);
    int count = scan.nextInt();
    for(int i = 0 ; i <=count ; i++){
      String key = scan.nextLine();
    	int c = map.getOrDefault(key,0);
      	map.put(key,c+1);
    }
    System.out.println("AC x " + map.getOrDefault("AC",0));
    System.out.println("WA x "+map.getOrDefault("WA",0));
    System.out.println("TLE x " + map.getOrDefault("TLE",0));
    System.out.println("RE x " + map.getOrDefault("RE",0));
                    
  
  }



}