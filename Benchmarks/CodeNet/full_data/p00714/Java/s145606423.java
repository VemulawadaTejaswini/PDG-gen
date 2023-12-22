import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Tank> tank;
		Water[] water;
		Data[] data;

		int d, n, m, l;
		int xl, xr, yl, yr;
		int x, inflow;
		int t, num;
		int thisTime = 0;
		
		d = sc.nextInt();
		for(int i = 0; i < d; i++){

			n = sc.nextInt();
			tank = new ArrayList<Tank>();
			xl = 0;
			yl = 50;
			for(int j = 0; j < n; j++){
				xr = sc.nextInt();
				yr = sc.nextInt();
				tank.add(new Tank(xl, yl, xr, yr));
				xl = xr;
				yl = yr;
			}
			xr = 100;
			yr = 50;
			tank.add(new Tank(xl, yl, xr, yr));

			tank.get(0).right = tank.get(1);
			for(int j = 1; j < tank.size()-1; j++){
				tank.get(j).left = tank.get(j-1);
				tank.get(j).right = tank.get(j+1);
			}
			tank.get(tank.size()-1).left = tank.get(tank.size()-2);

			m = sc.nextInt();
			water = new Water[m];
			for(int j = 0; j < water.length; j++){
				x = sc.nextInt();
				inflow = sc.nextInt();
				water[j] = new Water(x, inflow);
			}
			pour(tank, water);

			l = sc.nextInt();
			data = new Data[l];
			for(int j = 0; j < data.length; j++){
				num = j;
				x = sc.nextInt();
				t = sc.nextInt();
				data[j] = new Data(num, x, t);
			}

			quickSortTime(data, 0, data.length-1);
			
			for(int j = 0; i < data.length; j++)
				search(tank, data[j]);

			quickSortNum(data, 0, data.length-1);

			for(int j = 0; j < data.length; j++){
				System.out.println(data[j].h);
			}
		}
	}
	static void search(ArrayList<Tank> tank, Data data){

		for(int i = 0; i < tank.size(); i++){
			tank.get(i).flow(data.t);
		}
		while(true){
			int counter = 0;
			for(int i = 0; i < tank.size(); i++){
				if(tank.get(i).isFull()){
					if(tank.get(i).isLeftLow)
						tank.get(i).overFlowLeft(tank);
					else
						tank.get(i).overFlowRight(tank);
					counter++;
				}
			}
			if(counter == 0)
				break;
		}
		for(int i = 0; i < tank.size(); i++){
			if(data.x > tank.get(i).xl && data.x < tank.get(i).xr){
				data.h = tank.get(i).h;
				break;
			}
		}
	}
	static void pour(ArrayList<Tank> tank, Water[] water){
		for(int i = 0; i < tank.size(); i++){
			for(int j = 0; j < water.length; j++){
				if(water[j].x > tank.get(i).xl && water[j].x < tank.get(i).xr)
					tank.get(i).inflow += water[j].inflow;
			}
		}
	}
	static void quickSortNum(Data[] data, int left, int right){
        if (left <= right) {
            int p = data[(left+right) / 2].num;
            int l = left;
            int r = right;
            while(l <= r) {
                while(data[l].num < p){ l++; }
                while(data[r].num > p){ r--; }
                if (l <= r) {
                    Data tmp  = data[l];
                    data[l] = data[r];
                    data[r] = tmp;
                    l++; 
                    r--;
                }
            }
            quickSortNum(data, left, r);
            quickSortNum(data, l, right);
        }
    }
    static void quickSortTime(Data[] data, int left, int right){
        if (left <= right) {
            int p = data[(left+right) / 2].t;
            int l = left;
            int r = right;
            while(l <= r) {
                while(data[l].t < p){ l++; }
                while(data[r].t > p){ r--; }
                if (l <= r) {
                    Data tmp  = data[l];
                    data[l] = data[r];
                    data[r] = tmp;
                    l++; 
                    r--;
                }
            }
            quickSortTime(data, left, r);
            quickSortTime(data, l, right);
        }
    }
}
class Tank{
	int xl, xr;
	int yl, yr;
	int inflow = 0;
	double h = 0;
	boolean isLeftLow;
	Tank left = null, right = null;
	static int thisTime = 0;
	Tank(int xl, int yl, int xr, int yr){
		this.xl = xl;
		this.yl = yl;
		this.xr = xr;
		this.yr = yr;
		isLeftLow = (yl <= yr);
	}
	boolean isFull(){
		return (h > yl || h > yr);
	}
	void flow(int t){
		h += inflow * (t - thisTime) / (xr - xl) / 30;
		thisTime = t;
	}
	double rest(){
		if(isFull()){
			if(isLeftLow)
				return (h - yl) * (xr - xl);
			else
				return (h - yr) * (xr - xl);
		}else{
			return 0;
		}
	}
	void overFlowLeft(ArrayList<Tank> tank){
		left.h += rest() / (left.xr - left.xl);
		h = yl;
		if(left.isFull()){
			if(left.isLeftLow)
				left.overFlowLeft(tank);
			else
				unionLeft(tank);
		}
	}
	void overFlowRight(ArrayList<Tank> tank){
		right.h += rest() / (right.xr - right.xl);
		h = yr;
		if(right.isFull()){
			if(!right.isLeftLow)
				right.overFlowRight(tank);
			else
				unionRight(tank);
		}
	}
	void unionLeft(ArrayList<Tank> tank){
		h += left.rest() / (xr - left.xl);
		xl = left.xl;
		yl = left.yl;
		tank.remove(left);
	}
	void unionRight(ArrayList<Tank> tank){
		h += right.rest() / (right.xr - xl);
		xr = right.xr;
		yr = right.yr;
		tank.remove(right);
	}
		
}
class Water{
	int x;
	int inflow;
	Water(int x, int inflow){
		this.x = x;
		this.inflow = inflow;
	}
}
class Data{
	int num;
	int x;
	int t;
	double h;
	Data(int num, int x, int t){
		this.num = num;
		this.x = x;
		this.t = t;
	}
}