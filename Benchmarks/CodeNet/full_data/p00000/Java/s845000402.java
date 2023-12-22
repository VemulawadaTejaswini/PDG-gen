class QQ {
	int size;
	
	QQ(int n){
		size = n;
	}

	void printQQ(){
		for(int i=1; i<=size; i++)
			for(int j=1; j<=size; j++)
				System.out.println(i+"x"+j+"="+i*j);
	}
}

class Main {
	public static void main (String [] args){
		QQ q = new QQ(9);
		q.printQQ();
	}
}