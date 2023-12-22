import java.util.*;
import java.awt.Rectangle;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			int w=sc.nextInt(), h=sc.nextInt();
			Info[] info = new Info[n];
			HashMap<String,Integer> nameLink = new HashMap<String, Integer>();

			for(int i=0;i<n;i++){
				String name = sc.next();
				int m = sc.nextInt();

				nameLink.put(name,i);

				HashMap<Rectangle,String> bottun = new HashMap<Rectangle,String>();
				for(int j=0;j<m;j++){
					int x=sc.nextInt(),y=sc.nextInt();
					Rectangle tmp = new Rectangle(x,y,sc.nextInt()-x,sc.nextInt()-y);
					String toName = sc.next();
					bottun.put(tmp,toName);
				}

				info[i] = new Info(name,bottun);
			}

			List<String> ht = new LinkedList<String>();
			ht.add(info[0].name);

			int m = sc.nextInt();
			int p = 0;
			while(m-- > 0){
				String name = sc.next();
				if(name.equals("show")){
					System.out.println(ht.get(p));
				}
				else if(name.equals("back")){
					if(p > 0) p--;
				}
				else if(name.equals("forward")){
					if(p < ht.size()-1) p++;
				}
				else if(name.equals("click")){
					int x=sc.nextInt(), y=sc.nextInt();
					Info tmp = info[nameLink.get(ht.get(p))];

					String res = tmp.push(x,y);

					if(!res.equals("")){
						p++;
						ht = ht.subList(0,p);
						ht.add(res);
					}
				}
			}
		}
	}
}

class Info{
	String name;
	HashMap<Rectangle,String> button;

	Info(String name,HashMap<Rectangle,String> button){
		this.name = name;
		this.button = button;
	}

	String push(int x,int y){
		for(Rectangle r : button.keySet()){
			if(r.x <= x && x <= r.x+r.width && r.y <= y && y <= r.y + r.height){
				return button.get(r);
			}
		}

		return "";
	}
}