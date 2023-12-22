import java.util.*;
class Main{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		String[] b=new String[a];
		HashMap<String,Integer> m=new HashMap<String,Integer>();
		//Arrays.sort(b);
		for(int i=0;i<a;i++){
			b[i]=s.next();
			int c=s.nextInt();
			if(!m.containsKey(b[i]))m.put(b[i],c);
			else m.put(b[i],m.get(b[i])+c);
		}
		Arrays.sort(b);
		for(int i=1;i<6;i++){
			for(int j=0;j<a;j++){
				if(j==0||!b[j].equals(b[j-1])){
					if(b[j].length()==i)System.out.println(b[j]+" "+m.get(b[j]));
				}
			}
		}
	}
}