				break;
			list.add(new Swap(x,y));
		}
		scan.close();
		for(Swap s : list){
			s.smaller();
			System.out.println(s);
		}
		

	}

}

class Swap{
	int a;
	int b;
	public Swap(int x, int y){
		a = x;
		b = y;	
	}
	
	public void smaller(){
		if(a < b)
			return;
		int tmp = a;
		a=b;
		b=tmp;
	}

	@Override
	public String toString(){
		return a + " " + b;
	}

}