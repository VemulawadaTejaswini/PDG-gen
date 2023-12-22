import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while(true){
				/* input */
				int n = Integer.parseInt(br.readLine());
				
				if(n==0){
					break;
				}
				
				String tag = br.readLine();
				
				ArrayList<Panel> ps = parseTags(tag);
				
				for(int i=0;i<n;i++){
					String[] str = br.readLine().split(" ");
					int x = Integer.parseInt(str[0]), y = Integer.parseInt(str[1]);
					
					boolean found = false;
					Panel current = ps.get(0);
					while(true){
						//System.out.println("current: " + current.name);
						if(!current.point(x, y)){
							break;
						}
						found = true;
						boolean c = false;
						for(Panel child : current.children){
							if(child.point(x, y)){
								c = true;
								current = child;
								break;
							}
						}
						if(!c) break;

					}
					if(found){
						System.out.println(current.name + " " + current.children.size());
					} else {
						System.out.println("OUT OF MAIN PANEL 1");
					}
				}
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	static class Panel{
		public String name;
		public int x1,x2,y1,y2;
		public ArrayList<Panel> children;
		
		public Panel(String name, String coordinates){
			this.name = name;
			String[] c = coordinates.split(",");
			this.x1 = Integer.parseInt(c[0]);
			this.y1 = Integer.parseInt(c[1]);
			this.x2 = Integer.parseInt(c[2]);
			this.y2 = Integer.parseInt(c[3]);
			this.children = new ArrayList<Panel>();
		}
		
		boolean point(int x, int y){
			if(x1<=x&&x<=x2&&y1<=y&&y<=y2){
				return true;
			} else {
				return false;
			}
		}
		
		public void output(){
			System.out.print(this.name + ":");
			System.out.println(this.x1 + ", " + this.x2 + ", " + this.y1 + ", " + this.y2);
			System.out.print("CHILDREN:");
			for(Panel p : this.children){
				System.out.print(" " + p.name);
			}
			System.out.println();
		}
		
		public boolean parentOf(Panel p){
			if(this.x1<p.x1&&this.x2>p.x2&&this.y1<p.y1&&this.y2>p.y2) return true;
			return false;
		}
	}
	
	public static ArrayList<Panel> parseTags(String tags){
		ArrayList<Panel> p = new ArrayList<Panel>();
		
		Pattern pat = Pattern.compile("<[^/].+?>");
		Pattern patc = Pattern.compile("</.+?>");
		Pattern pat2 = Pattern.compile(">[0-9].*?<");
		Matcher m = pat.matcher(tags);
		Matcher mc = patc.matcher(tags);
		Matcher m2 = pat2.matcher(tags);
		
		while(m.find()){
			if(m2.find()&&mc.find()){
				String name = m.group().substring(1,m.group().length()-1);
				String coordinates = m2.group(0).substring(1,m2.group(0).length()-1);
				
				//System.out.println(name +  " s:" + m.start());
				
				Panel newp = new Panel(name,coordinates); 
				
				for(Panel pp : p){
					if(pp.parentOf(newp)){
						pp.children.add(newp);
					}
				}
				
				p.add(newp);
			}
		}
		
		return p;
	}
}