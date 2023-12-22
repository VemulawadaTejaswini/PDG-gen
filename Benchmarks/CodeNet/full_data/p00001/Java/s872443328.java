class Main{
    public static void main(String[] a){
    	int mnt[] = {0,100,200,300,400,500,600,700,800,900};
    	int max[] = {0,0,0};
    	for(int i=0;i<10;i++){
    		int count=mnt[i];
    		if(max[0]<count){
    			max[0]=count;
    		}
    	}
    	for(int i=0;i<10;i++){
    		int count=mnt[i];
    		if(max[1]<count&count!=max[0]){
    			max[1]=count;
    		}
    	}
    	for(int i=0;i<10;i++){
    		int count=mnt[i];
    		if(max[2]<count&count!=max[0]&count!=max[1]){
    			max[2]=count;
    		}
    	}
    	
    	System.out.println(max[0]);
    	System.out.println(max[1]);
    	System.out.println(max[2]);
    }
}