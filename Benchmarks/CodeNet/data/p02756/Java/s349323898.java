import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
  		String s=sc.next();
  		List<String> a = new ArrayList<String>();
		a.addAll(Arrays.asList(s.split("")));
        int q=sc.nextInt();
  		int b=0;
  		int f=0;
  		String d="";
    
		for(int c=0;c<q;c++){
    		b=sc.nextInt();
          if(b==1){
            String a1=a.get(0);
          	a.set(0,a.get(a.size()-1));
            a.set(a.size()-1,a1);
          }else if(b==2){
            f=sc.nextInt();
            d=sc.next();
          	if(f==1){
             a.add(0,d);
            }else{
            a.add(d);
            }
          }
    	}
  	String ans="";
    
 	for(String str:a){
    ans+=str;
    }

    	System.out.println(ans);
    }
}