week = ['SUN','MON','TUE','WED','THU','FRI','SAT']
let order = 0;
for(let i = 0, i < week.length; i ++){
	if(week[i] == S){
    	return 7 - i
    }
}