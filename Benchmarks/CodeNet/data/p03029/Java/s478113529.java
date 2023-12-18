import java.util.*;
import java.lang.*;
 class Soln{
	private String name;
	private int score;
    private int num ;
	
	public Soln(String name,int score,int num){
	this.name=name;
	this.score=score;
	this.num=num;
	}

	public int getScore(){
		return this.score;
	}

	public String getName(){
		return this.name;
	}

	public int getNum(){
		return this.num;
	}
}

class Main{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int pos = 1;
	List<Soln> rest = new ArrayList<Soln>();
	for(int i =1;i<=n;i++){
	String name = sc.next();
	int score = sc.nextInt();
	rest.add(new Soln(name,score,pos));
	pos+=1;
	}

	Comparator<Soln>com = new Comparator<Soln>(){
            @Override
            public int compare(Soln s1,Soln s2){
            	if(s1.getName()!=s2.getName())
            		return s1.getName().compareTo(s2.getName());
                
                else if(s1.getName()==s2.getName()){
                    
                    return (s1.getScore()>s2.getScore())?1:-1;
                    
                    
                }
                else
                return -1;   
        }
        };


        Collections.sort(rest,com);
        for(Soln st: rest){
System.out.println(st.getNum());		}
	
	}
}