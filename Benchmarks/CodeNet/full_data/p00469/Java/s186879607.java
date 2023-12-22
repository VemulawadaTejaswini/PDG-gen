import java.util.*;

class Main{
	public  static void main(String args[]){
		Scanner s=new Scanner(System.in);
		while(true){
			int a=s.nextInt();
			int b=s.nextInt();
			if(a+b==0)System.exit(0);
			HashMap<String, Boolean> map=new HashMap<String,Boolean>();
			String[] c=new String[a];
			for(int i=0;i<a;i++){
				c[i]=s.next();
			}
			int count=0;
			for(int i=0;i<a;i++){
				for(int j=0;j<a;j++){
					if(b>2){
						for(int k=0;k<a;k++){
							if(b>3){
								for(int l=0;l<a;l++){
									if(i!=j&&i!=k&&i!=l&&j!=k&&j!=l&&k!=l&&!map.containsKey(c[i]+c[j]+c[k]+c[l])){
										count++;
										map.put(c[i]+c[j]+c[k]+c[l],true);
									}
								}
							}else{
								if(i!=j&&i!=k&&j!=k&&!map.containsKey(c[i]+c[j]+c[k])){
									count++;
									map.put(c[i]+c[j]+c[k],true);
								}
							}
						}
					}else{
						if(i!=j&&!map.containsKey(c[i]+c[j])){
							count++;
							map.put(c[i]+c[j],true);
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}