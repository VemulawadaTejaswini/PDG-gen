#include <bits/stdc++.h>

using namespace std;

double value[45];
int size[45];

double get_value(string &pile){
    bool b_can_move = 0, w_can_move = 0;
    double b_max, w_min;
    double last_value = 0;
    for(int i=0;i<pile.length();i++){
        double value;
        if(pile[i]=='B'){
            /*if(b_can_move){
                b_max = max(b_max,last_value);
            }
            else{
                b_max = last_value;
            }*/
            b_max = last_value;
            b_can_move = 1;
            if(w_can_move){
                value = (b_max + w_min) / 2;
            }
            else{
                value = b_max + 1;
            }
        }
        if(pile[i]=='W'){
            /*if(w_can_move){
                w_min = min(w_min,last_value);
            }
            else{
                w_min = last_value;
            }*/
            w_min = last_value;
            w_can_move = 1;
            if(b_can_move){
                value = (b_max + w_min) / 2;
            }
            else{
                value = w_min - 1;
            }
        }
        last_value = value;
    }
    return last_value;
}

#define map unordered_map

void enumerate(int st, int ed,map<double,int> &table ,double value_sum = 0, int size_sum = 0){
    if(st==ed){
        if(table.count(value_sum)){
            table[value_sum] = max(table[value_sum], size_sum);
        }
        else{
            table[value_sum] = size_sum;
        }
    }
    else{
        enumerate(st+1, ed, table, value_sum, size_sum);
        enumerate(st+1, ed, table, value_sum + value[st], size_sum + size[st]);
    }
}

int find_zero_value(int st,int ed,map<double,int> &table ,double value_sum = 0, int size_sum = 0){
    if(st==ed){
        if(table.count(-value_sum)){
            return table[-value_sum] + size_sum;
        }
        else return 0;
    }
    else{
        int get1 = find_zero_value(st+1, ed, table, value_sum, size_sum);
        int get2 = find_zero_value(st+1, ed, table, value_sum + value[st], size_sum + size[st]);
        return max(get1, get2);
    }
}

map<double,int> table, table2;

int main()
{
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        string pile;
        cin>>pile;
        size[i] = pile.length();
        value[i] = get_value(pile);
    }
    if(n<=20){
        enumerate(0,n,table);
        printf("%d\n",table[0]);
    }
    else{
        enumerate(0,20,table);
        printf("%d\n",find_zero_value(20,n,table));
    }

    return 0;
}