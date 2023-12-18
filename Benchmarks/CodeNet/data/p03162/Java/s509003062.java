#include<iostream>

using namespace std;

int main(){
	int n;
	int blockCol;
	int pts = 0;
	int p = 0;
	int aux;
	
	scanf("%d", &n);
	
	int m[n][3];
	
	for(int i = 0; i < n; i++){
		p = 0;
		for(int j = 0; j < 3; j++){
			scanf("%d", &m[i][j]);
			if(m[i][j] > p && ( i == 0 || (i > 0 && blockCol != j))){
				p = m[i][j];
				aux = j;
			}
		}
		blockCol = aux;
		pts += p;
	}
	
	printf("%d",pts);
}