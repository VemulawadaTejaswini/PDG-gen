import java.util.*;
 
class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
     	int num = scn.nextInt();
      	final String[] word = {"AC","WA","TEL","RE"};
      	int[] cnum = new int[4];
      	for(int count = 0;count < num;count++){
        	String str = scn.next();
          	switch(str){
            	case "AC":cnum[0]++;break;
                case "WA":cnum[1]++;break;
                case "TLE":cnum[2]++;break;
                case "RE":cnum[3]++;break;
            }
        }
      	for(int count = 0;count < 4;count++){
			System.out.println(word[count] + " x " + cnum[count]);
        }
    }
}
