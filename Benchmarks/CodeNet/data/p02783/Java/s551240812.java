int atackTimes = 0;

int tmpHp = 0;
do {
 	tmpHp = H - A;
 	atackTimes++;
} while (tmpHp > 0) {
	tmpHp = tmpHp - A;
  	atackTimes++;
}
  return atackTimes;
}