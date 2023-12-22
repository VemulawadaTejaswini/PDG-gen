import java.util.*;

class Pos{
	double x,y,z;
}
class Scope{
	double lx,ly,lz,phi;
}

class Main{
	Scanner scan = new Scanner(System.in);
	int star_num;
	int scope_num;
	int ans;
	Pos[] pos;
	Scope[] scope;
	public double keisan(int i,int j,Pos[] pos,Scope[] scope){
		return Math.acos((pos[i].x*scope[j].lx+pos[i].y*scope[j].ly+pos[i].z*scope[j].lz)/
		(Math.sqrt(pos[i].x*pos[i].x+pos[i].y*pos[i].y+pos[i].z*pos[i].z)*(Math.sqrt(scope[j].lx*scope[j].lx+scope[j].ly*scope[j].ly+scope[j].lz*scope[j].lz))));
	}
	public void run(){
		while(true){
			star_num = scan.nextInt();
			if(star_num == 0) break;
	 		pos = new Pos[star_num];
			for(int i=0;i<star_num;i++){
				pos[i] = new Pos();
				pos[i].x = scan.nextDouble();
				pos[i].y = scan.nextDouble();
				pos[i].z = scan.nextDouble();
			}
			scope_num = scan.nextInt();
			scope = new Scope[scope_num];
			for(int i=0;i<scope_num;i++){
				scope[i] = new Scope();
				scope[i].lx = scan.nextDouble();
				scope[i].ly = scan.nextDouble();
				scope[i].lz = scan.nextDouble();
				scope[i].phi = scan.nextDouble();
			}
			ans=0;
			for(int i=0;i<star_num;i++){
				for(int j=0;j<scope_num;j++){
					if(keisan(i,j,pos,scope) < scope[j].phi){
						ans++;
						break;
					}
				}
			}
		System.out.println(ans);
		}
	}

    public static void main(String[] args){
		Main app = new Main();
		app.run();
    }
}