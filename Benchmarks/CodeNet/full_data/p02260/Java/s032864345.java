import java.util.Arrays;
public class Main {        
	int[] random(int n) {        
		int[] a = new int[n];        
		for(int i = 0; i < n; i++) {            
			a[i] = (int)(Math.random() * 1000);       
		}        return a;    }        
	void swap(int[] a, int i, int j) {        
		int temp = a[i];        
		a[i] = a[j];        
		a[j] = temp;    
	}       
	void bubbleSort(int[] a) {       
		// バブルソート 未完成   
		for(int f =1; f<a.length; f++) {
		for(int i = 1; i < a.length; i++) {            
			if(a[i-1] > a[i]) {                
				swap(a, i-1, i);            
			}  
		}
		}    
	}   
