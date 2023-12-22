#include <stdio.h>
#include <stdlib.h>
#include <iostream>
#include <limits.h>
int n; //the sieze of the target array
int l; // the real size of tree;
int q; //number of querys
int *D; //segment tree, D[i] = min value in range node i
int s;
int t;
int x;
int com;
int INF;
int array2tree(int k){return k+n-1;}
int parent(int k){return (k-1)/2;}
int left_child(int k){return 2*k+1;}
int right_child(int k){return 2*k+2;}
int MIN(int ki){ if(D[left_child(ki)] > D[right_child(ki)]){return D[right_child(ki)];}else{return D[left_child(ki)];}    }
int min(int a, int b){if (a > b){return b;}else{return a;} }

void initRMQ();
void update_leaf();
void update(int ki, int ks, int kt);
int find(int ki);
void fetch();

int main(){
	scanf("%d %d",&n,&q);
	initRMQ();
	while(q>0){
		fetch();
		q--;
	}
}

void initRMQ(){
	INF = INT_MAX;
	int i = 1;
	while( i< n ){
		i *= 2;
	}
	if(i>1){
	l = 2*i-1-1;
	}else {l = 1;};
	D = new int[l];
	if(!D){printf("new a D array falied \n");return;}
	for(i = 0; i<l;i++){
		D[i] = INF;
	}

}// end of initRMQ

void fetch(){
	scanf("%d",&com);
	if(com){
		scanf("%d",&s);
		printf("%d\n",find(s));
	}else{
		scanf("%d %d %d",&s,&t,&x);
		t++;
		//update_leaf();
		update(0,0,l);
	}
}
int find(int ki){
	//check range
	//if(ks>kt || ks>t || kt<s){return INF;}
//
	//if(ks >= s && kt <= t){
	//	return D[ki];
	//}
	// start recursive
	//int mid = (ks+kt)/2;
	//return min(find(left_child(ki),ks, mid), find(right_child(ki), mid+1, kt));
	if(n > 1){
	return D[l - (n - ki)];}
	else{
		return D[0];
	}
}
void update_leaf(){
	int i;
	int ks = s+ n -1;
	int kt = t + n-1;
	for(i = ks; i <= kt; i++){
		D[i] = x;
	}
}
void update(int ki, int ks, int kt){
	int i;
	int mid = (ks+kt)/2;
	//check range
	if(kt <= s  || t <= ks ){return;}

	
	if(s <= ks && kt <= t){
		if(ki < l-n){
			update(left_child(ki),ks, mid);
			update(right_child(ki), mid, kt);
		}else {
		if(ks != kt){
			update(ki+1,ks+1,kt);
		}
		}

		D[ki] = x;
		return;
	}

	// start recursive
	if(ki < l-n){
	update(left_child(ki),ks, mid);
	update(right_child(ki), mid, kt);
	D[ki] = MIN(ki);
	}else {if(ks != kt){
		update(ki+1, ks+1, kt);
	}}

	
}// end of update



