import java.util.*;

class Main{
		int[] count = new int[26];

	public static void main(String[] args){
		for(int i=0;i<26;i++){
			count[i]=0;
		}
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()){
			String line=sc.nextLine();
			for(int i=0;i<line.length();i++){
				String str =line.substring(i,i+1);
		if(s.equals("A") || s.equals("a")){
			count[0]+=1;
		}else if(s.equals("B") || s.equals("b")){
			count[1]+=1;
		}else if(s.equals("C") || s.equals("c")){
			count[2]+=1;
		}else if(s.equals("D") || s.equals("d")){
			count[3]+=1;
		}else if(s.equals("E") || s.equals("e")){
			count[4]+=1;
		}else if(s.equals("F") || s.equals("f")){
			count[5]+=1;
		}else if(s.equals("G") || s.equals("g")){
			count[6]+=1;
		}else if(s.equals("H") || s.equals("h")){
			count[7]+=1;
		}else if(s.equals("I") || s.equals("i")){
			count[8]+=1;
		}else if(s.equals("J") || s.equals("j")){
			count[9]+=1;
		}else if(s.equals("K") || s.equals("k")){
			count[10]+=1;
		}else if(s.equals("L") || s.equals("l")){
			count[11]+=1;
		}else if(s.equals("M") || s.equals("m")){
			count[12]+=1;
		}else if(s.equals("N") || s.equals("n")){
			count[13]+=1;
		}else if(s.equals("O") || s.equals("o")){
			count[14]+=1;
		}else if(s.equals("P") || s.equals("p")){
			count[15]+=1;
		}else if(s.equals("Q") || s.equals("q")){
			count[16]+=1;
		}else if(s.equals("R") || s.equals("r")){
			count[17]+=1;
		}else if(s.equals("S") || s.equals("s")){
			count[18]+=1;
		}else if(s.equals("T") || s.equals("t")){
			count[19]+=1;
		}else if(s.equals("U") || s.equals("u")){
			count[20]+=1;
		}else if(s.equals("V") || s.equals("v")){
			count[21]+=1;
		}else if(s.equals("W") || s.equals("w")){
			count[22]+=1;
		}else if(s.equals("X") || s.equals("x")){
			count[23]+=1;
		}else if(s.equals("Y") || s.equals("y")){
			count[24]+=1;
		}else if(s.equals("Z") || s.equals("z")){
			count[25]+=1;
		}
			}
		}
		System.out.println("a : "+count[0]);
		System.out.println("b : "+count[1]);
		System.out.println("c : "+count[2]);
		System.out.println("d : "+count[3]);
		System.out.println("e : "+count[4]);
		System.out.println("f : "+count[5]);
		System.out.println("g : "+count[6]);
		System.out.println("h : "+count[7]);
		System.out.println("i : "+count[8]);
		System.out.println("j : "+count[9]);
		System.out.println("k : "+count[10]);
		System.out.println("l : "+count[11]);
		System.out.println("m : "+count[12]);
		System.out.println("n : "+count[13]);
		System.out.println("o : "+count[14]);
		System.out.println("p : "+count[15]);
		System.out.println("q : "+count[16]);
		System.out.println("r : "+count[17]);
		System.out.println("s : "+count[18]);
		System.out.println("t : "+count[19]);
		System.out.println("u : "+count[20]);
		System.out.println("v : "+count[21]);
		System.out.println("w : "+count[22]);
		System.out.println("x : "+count[23]);
		System.out.println("y : "+count[24]);
		System.out.println("z : "+count[25]);
	}
}