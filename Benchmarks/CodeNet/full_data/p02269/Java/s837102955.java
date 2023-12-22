import java.util.*;

class Main{
	public static void main(String[] args)throws NoSuchElementException{

	Scanner sc=new Scanner(System.in);
	String[] yomikomi=new String[2];
	List<String> jisyo=new ArrayList<String>();

	int limit=Integer.parseInt(sc.next());

	for(int i=0; i<limit; i++){
			sc=new Scanner(System.in);
			yomikomi[0]=sc.next();
			yomikomi[1]=sc.next();

			if(yomikomi[0].equals("insert")){
				jisyo.add(yomikomi[1]);
			}

			else if(yomikomi[0].equals("find")){
				if(jisyo.contains(yomikomi[1])==false){
					System.out.println("no");
				}
				else{
					System.out.println("yes");
				}
			}
		}
	}
}
